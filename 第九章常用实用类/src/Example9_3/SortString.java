package Example9_3;

public class SortString {
    //public class SortString {
        public static void sort(String[] args) {
            for (int i = 0; i < args.length-1; i++) {
                for (int j = i+1; j < args.length ; j++) {
                    if(args[j].compareTo(args[i])<0){
                        String temp=args[i];
                               args[i]=args[j];
                               args[j]=temp;
                    }
                }
            }
        }
}
