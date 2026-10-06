package Practice;

public class JAVA {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4};
//        int[] arr2=arr.clone();
//
//        for(int n:arr){
//            System.out.println(n);
//        }

//        int[] arr3 = {1, 2, 7, 9, 8};
//        int[] tempArr = new int[arr3.length];
//        System.arraycopy(arr3, 0, tempArr, 0, arr3.length);
//
//        for(int n:arr3){
//            System.out.println(n);
//        }

        class Dog{
            String name;
            String color;

//            public Dog(String name, String color) {
//                this.name = name;
//                this.color = color;
//            }

            public String getName(){
                return name;
            }
        }

        Dog d= new Dog();
        System.out.println(d.getName());

    }
}
