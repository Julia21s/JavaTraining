package Experiments;

import lesson3.Gender;
import lesson3.PersonWithGender;

public class StringsMethods {
    //Задание после урока 3 - использование методов работы со строками
    public static class StringMethodsPractice {

                public static void main(String[] args) {


                    String str = new String();

                    PersonWithGender teamLead = new PersonWithGender("Petro", "Ivanenko",35, Gender.MALE);
                    PersonWithGender seniorDeveloper = new PersonWithGender("Ivan", "Petrenko",34, Gender.MALE);
                    PersonWithGender middleDeveloper = new PersonWithGender("John", "Smith",33, Gender.MALE);
                    PersonWithGender juniorDeveloper = new PersonWithGender("Rajesh", "Kutrapalli",30, Gender.MALE);
                    PersonWithGender seniorTestAutomation = new PersonWithGender("Julia", "Stankevich",20, Gender.MALE);
                    PersonWithGender middleTestAutomation = new PersonWithGender("Juliana", "Smithson",25, Gender.MALE);
                    PersonWithGender juniorTestAutomation = new PersonWithGender("Rajadar", "Sutrapalli",25, Gender.MALE);
                    PersonWithGender traineeTestAutomation = new PersonWithGender("Raj", "Sutrapalli",25, Gender.MALE);

                    PersonWithGender[] professionals = {teamLead, seniorDeveloper, middleDeveloper,
                                                        juniorDeveloper,seniorDeveloper,seniorTestAutomation,
                                                        middleTestAutomation, juniorTestAutomation, traineeTestAutomation};
                    String searchStr = "Raj";
                    int n = professionals.length;
                    System.out.println(seniorTestAutomation.getFirstName());
                    for (int i = 0; i < professionals.length; i++) {
                        PersonWithGender professional = professionals[i];
                        // StartsWith and EndsWith
                        if (professional.getFirstName().startsWith(searchStr) || professional.getSecondName().startsWith(searchStr)) {
                            System.out.println("This person's name " + professional.toString() + " starts with the string " + searchStr);
                        }
                        if (professional.getFirstName().endsWith(searchStr) || professional.getSecondName().endsWith(searchStr)) {
                            System.out.println("This person's name " + professional.toString() + " end with the string " + searchStr);
                        }
                        /* equals */
                        if (professional.equals(searchStr)) {
                            System.out.println("This person's name " + professional.toString() + " equals to " + searchStr);
                        }
                    }
                }

                void PersonCompare (String searchStr, PersonWithGender person){
                   /*
                    int n = persons.length;
                    for(int i=0;i<n;i++){
                        if(persons[i].getFirstName()==""){}

                    */
                    if(person.getFirstName().startsWith(searchStr)||person.getSecondName().startsWith(searchStr))
                    {
                        System.out.println("This person's name " +person + " starts with the string "+ searchStr);
                    }
                   if(person.getFirstName().endsWith(searchStr)||person.getSecondName().endsWith(searchStr))
                   {
                       System.out.println("This person's name " +person + " end with the string "+ searchStr);
                    }


                }



        }
}
