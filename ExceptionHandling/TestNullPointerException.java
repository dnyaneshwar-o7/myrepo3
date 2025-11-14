package ExceptionHandling;


    public class TestNullPointerException {
        int a = 100;
        void test(){
            System.out.println("called test method");
        }

        public static void main(String[] args) {
            TestNullPointerException npe = null;
            //new TestNullPointerException();

       /* if(npe == null) {
            npe = new TestNullPointerException();
            System.out.println(npe.a);
        }*/
            //npe = null;
            try{
                npe.test();
            } catch (NullPointerException ne) {
                System.out.println(ne.getMessage());
            }


            int[] intArray = {1,2,3,4,5,6,7,8};;
            //{1,2,3,4,5,6,7,8};

            for (int i = 0; i < intArray.length; i++){
                System.out.println("Value in intArray at index "+ i + " is "+intArray[i]);
            }
        }
    }

