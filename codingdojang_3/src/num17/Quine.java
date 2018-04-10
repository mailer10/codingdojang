package num17;

public class Quine {
    public static void main(String[] args) {
        char quote = '"';
        String[] code = {
"public class Quine {",
"    public static void main(String[] args) {",
"        char quote = '\"';",
"        String[] code = {",
"        };",
"        for(int i=0; i<4; i++){",
"            System.out.println(code[i]);",
"        }",
"        for(int i=0; i<code.length; i++){",
"            System.out.println(quote + code[i] + quote + ',');",
"        }",
"        for(int i=4; i<code.length; i++){",
"            System.out.println(code[i]);",
"        }",
"    }",
"}",
        };
        for(int i=0; i<4; i++){
            System.out.println(code[i]);
        }
        for(int i=0; i<code.length; i++){
            System.out.println(quote + code[i] + quote + ',');
        }
        for(int i=4; i<code.length; i++){
            System.out.println(code[i]);
        }
    }
}