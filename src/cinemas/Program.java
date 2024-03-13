package cinemas;

public class Program {
    public static void main(String[] args) throws InvalidIdLengthException, InvalidIdCharsException {
        Cinema cinema1 = new Cinema();
        System.out.println(cinema1);
        Person[] people1 = new Person[cinema1.getTicketSales()];
        fillPeopleArray(people1);
        for (Person person : people1) {
            person.print();
            System.out.println(returnPersonalIncome(cinema1, person) + "\n");

        }

//        System.out.println(returnPersonalIncome(cinema1, people1[0]));
//        System.out.println(returnTotalCinemaIncome(cinema1,people1,people1.length-1));
//        System.out.println(Arrays.toString(returnPeopleCountByType(people1)));
        printCinemaData(cinema1, people1);


    }

    public static void fillPeopleArray(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            try {
                switch ((int) (Math.random() * 3)) {
                    case 0:
                        people[i] = new Student("student" + (int) (Math.random() * 170 + 1), "123456789", (int) (Math.random() * 30 + 21), Person.Gender.values()[(int) (Math.random() * 2 + 0)]);
                        ((Student) people[i]).setSchool("School" + (int) (Math.random() * 5 + 1));
                        ((Student) people[i]).setProfession("Math");
                        break;
                    case 1:
                        people[i] = new Teacher("teacher" + (int) (Math.random() * 170 + 1), "987654321", (int) (Math.random() * 30 + 50), Person.Gender.values()[(int) (Math.random() * 2 + 0)]);
                        ((Teacher) people[i]).setYearsTeaching((int) (Math.random() * 30 + 21));
                        ((Teacher) people[i]).setProfession("Science");
                        break;
                    case 2:
                        people[i] = new Worker("worker" + (int) (Math.random() * 170 + 1), "987654321", (int) (Math.random() * 30 + 30), Person.Gender.values()[(int) (Math.random() * 2 + 0)]);
                        ((Worker) people[i]).setMonthlySalary((int) (Math.random() * 20000 + 10000));
                }
            }
            catch (InvalidIdLengthException e) {
                System.out.println("Invalid id length");
                i--;
            }
            catch (InvalidIdCharsException e) {
                System.out.println("Invalid characters - Numbers only");
                i--;
            }
        }
    }

    static void printCinemaData(Cinema cinema, Person[] people) {
        System.out.println("Total income: " + returnTotalCinemaIncome(cinema, people, people.length - 1));
        System.out.println("Movie price: " + cinema.getPrice());
        System.out.println("Ticket sales: " + cinema.getTicketSales());
        int[] peopleCountByType = returnPeopleCountByType(people);
        System.out.println("Students: " + peopleCountByType[0]);
        System.out.println("Teachers: " + peopleCountByType[1]);
        System.out.println("Workers: " + peopleCountByType[2]);


    }

    static int returnTotalCinemaIncome(Cinema cinema, Person[] people, int peopleCount) {
        if (peopleCount > 0) {
            return returnPersonalIncome(cinema, people[peopleCount]) + returnTotalCinemaIncome(cinema, people, peopleCount - 1);
        } else
            return returnPersonalIncome(cinema, people[peopleCount]);
    }

    static int returnPersonalIncome(Cinema cinema, Person person) {
        return (int) (cinema.getPrice() * returnPriceModifier(cinema, person));
    }

    static double returnPriceModifier(Cinema cinema, Person person) {
        if (person instanceof Student) {

            return 1 - (double) cinema.getStudentDiscount() / 100;
        } else if (person instanceof Teacher) {

            return 1 - (double) cinema.getTeacherDiscount() / 100;
        } else {
            return 1;
        }
    }

    static int[] returnPeopleCountByType(Person[] people) {
        int[] result = new int[]{0, 0, people.length};
        for (Person person : people) {
            if (person instanceof Student) {
                result[0]++;
                result[2]--;
            } else if (person instanceof Teacher) {
                result[1]++;
                result[2]--;

            }

        }
        return result;
    }
}
