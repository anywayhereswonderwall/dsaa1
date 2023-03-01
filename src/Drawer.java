//package dsaa.lab01;

public class Drawer {
    private static void drawLine(int n, char ch) {
        // TODO
        int i=0;
        while(i<n) {
            System.out.print(ch);
            i++;
        }
    }


    public static void drawPyramid(int n) {
        // TODO
        int currentLine = 1;
        while(currentLine <= n) {
            drawLine(n - currentLine,'.');
            drawLine(2 * currentLine - 1,'*');
            drawLine(n - currentLine,'.');
            System.out.println();
            currentLine++;
        }
    }


    public static void drawChristmassTree(int n) {
        // TODO

        for (int i = 1; i <= n; i++) {
            int cur_height = i;
            int current_line = 1;
            while (current_line <= cur_height) {
                drawLine(n - current_line, '.');
                drawLine(2 * current_line - 1, '*');
                drawLine(n - current_line, '.');
                System.out.println();
                current_line++;
            }
        }
    }

}