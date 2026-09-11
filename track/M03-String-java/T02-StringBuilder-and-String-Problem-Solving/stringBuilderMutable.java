public class stringBuilderMutable {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        sb.ensureCapacity(100);//capacity will be given by user
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.append(" Program");
        System.out.println(sb);
    }
}
