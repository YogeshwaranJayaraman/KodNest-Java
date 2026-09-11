public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0

        sb.append("Java");
        System.out.println(sb);
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//4

        sb.append(" is a Progaramming Language");
        System.out.println(sb.capacity());//34
        System.out.println(sb.length());//30

        sb.append(" and Object Oriented");
        System.out.println(sb.capacity());//70
        System.out.println(sb.length());//50



    }
    
}
