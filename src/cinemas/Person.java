package cinemas;

public abstract class Person {
    private String fullName;
    private String id;
    private int age;
    private Gender gender;
    private final static int idLength = 9;

    public Person() {
    }

    public Person(String fullName, String id, int age, Gender gender) throws InvalidIdLengthException, InvalidIdCharsException {
        setFullName(fullName);
        setId(id);
        setAge(age);
        setGender(gender);

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws InvalidIdLengthException, InvalidIdCharsException {
        if (id.length() != idLength) {
            throw new InvalidIdLengthException();
        } else {
            for (int i = 0; i < id.length(); i++) {
                if ((int) id.charAt(i) > 57 || (int) id.charAt(i) < 48) {
                    throw new InvalidIdCharsException();
                }
            }
            this.id = id;
        }
    }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public Gender getGender () {
            return gender;
        }

        public void setGender (Gender gender){
            this.gender = gender;
        }

        public void print () {
            System.out.println("Name: " + fullName);
            System.out.println("id: " + id);
            System.out.println("age: " + age);
            System.out.println("Gender: " + gender);
        }
        enum Gender {
            Male, Female
        }
    }
