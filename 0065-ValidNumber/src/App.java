public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        //Example 1:
        System.out.println(solution.isNumber("0"));
        
        //Example 2:
        System.out.println(solution.isNumber("e"));
        
        //Example 3:
        System.out.println(solution.isNumber("."));

        //Example 4:
        System.out.println(solution.isNumber("-89"));

        //Example 5:
        System.out.println(solution.isNumber(".15"));

        //Example 6:
        System.out.println(solution.isNumber("3."));

        //Example 7:
        System.out.println(solution.isNumber("5e6"));
    
        //Example 8:
        System.out.println(solution.isNumber("46.e3"));
        
        //Example 9:
        System.out.println(solution.isNumber("32.e-80123"));
        
        //Example 10:
        System.out.println(solution.isNumber("1E9"));
        
        //Example 11:
        System.out.println(solution.isNumber(".703e+4144"));
    }


}
