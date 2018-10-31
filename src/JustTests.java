import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class JustTests {

    public static void main(String[] args) {
        List<Person> people = Person.createRoster();

        calcMF();
        calcState(people, "TX");
        calcStateJobs(people, "Java", "TX");
        Set<String> states = getListOfStates(people, "Java");
        System.out.println("states =" + states + "there are " + states.size() + " states with Java Jobs");
        Set<String> jobs = getJobs(people);
        System.out.println("Found these jobs = "+ jobs + " : there are "+ jobs.size()+ "different job types");
    }




    private static  Set<String> getJobs(List<Person> people){
        Set<String> jobs = new TreeSet<>();
        for (Person person : people) {
                jobs.add(person.getJob());
            }
        return jobs;

    }

    private static Set<String> getListOfStates(List<Person>people, String jobs){
        Set<String> states = new TreeSet<>();
        for (Person person : people) {
            if(person.getJob().equalsIgnoreCase(jobs)) {
                states.add(person.getState());
            }
        }
        return states;
    }

    private static void calcStateJobs(List<Person> people, String job, String state){
        int count = 0;


        for(Person person : people){
            if(person.getState().equalsIgnoreCase(state)) {
                if (person.getJob().equalsIgnoreCase(job)) {
                    count++;
                }
            }

        }
        System.out.println(count + " " + job + " "+ " programmers live in " + state);
    }


    private static void calcState(List<Person>people, String state){

        int peopleOfState = 0;
        for(Person person : people){
            if(person.getState().equalsIgnoreCase(state)){
                peopleOfState++;
            }
        }
        System.out.println(peopleOfState+ "lives in  : " + state);
    }


    private static void calcMF(){
        int males = 0, females = 0;
        List<Person> people = Person.createRoster();
        for(Person person : people){
            if(person.getGender() == Person.Gender.MALE){
                males++;
            }else {
                females++;

            }
        }
        System.out.println("males : " + males);
        System.out.println("Females : " + females);
    }

}
