public class EscapeSequencesExample {
    public static void main(String[] args) {
        System.out.println("Hello\tWorld!"); // 输出 "Hello   World!" （三个空格）
        System.out.println("First line.\nSecond line."); // 输出 "First line.\nSecond line."
        System.out.println("Path: C:\\Windows\\System32"); // 输出 "Path: C:\Windows\System32"
        System.out.println("He said: \"Hello, world!\""); // 输出 "He said: "Hello, world!""
        System.out.println("He said: 'Hello, world!'"); // 输出 "He said: 'Hello, world!'"
    }
}