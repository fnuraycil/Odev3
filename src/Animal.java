 public class Animal {
     String name;
     int age;

    // Getter
    public String getName() {
        return name;
    }

    public void setName(String c) {
        this.name = c;
    }

     public int getAge() {
         return age;
     }

     public void setAge(int c) {
         this.age = c;
     }

     public int getAgeInHumanYears(int a){
        if( a <= 2){
            a = a + 11;
        }else
            a = 22 + ((a-2) * 5);

        return a;
     }
}
