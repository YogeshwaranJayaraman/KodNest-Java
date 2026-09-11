public class stringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        sb.append(" Program");
        System.out.println(sb);

        sb.insert(0,"Python ");//Insert from 0th index
        System.out.println(sb);

        sb.delete(0, 4);//Delete Character from Index 0 to 4-1
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
