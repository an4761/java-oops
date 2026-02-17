public class OOPSUC4 {

    public static void main(String[] args) {

        // Banner lines stored in an array
        String[] banner = new String[] {

            String.join(" ", 
                " ***** ", " ***** ", " ***** ", " ***** "
            ),

            String.join(" ", 
                "*     *", "*     *", "*     *", "*"
            ),

            String.join(" ", 
                "*     *", "*     *", " ***** ", " ***** "
            ),

            String.join(" ", 
                "*     *", "*     *", "*       ", "     *"
            ),

            String.join(" ", 
                "*     *", "*     *", "*       ", "     *"
            ),

            String.join(" ", 
                "*     *", "*     *", "*     *", "*"
            ),

            String.join(" ", 
                " ***** ", " ***** ", "  ", " ***** "
            )
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
