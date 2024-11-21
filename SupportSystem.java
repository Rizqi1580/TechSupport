public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();

            if(input.toLowerCase().startsWith("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse(input.toLowerCase());
                System.out.println(response);
            }
        }
        printGoodbye();
    }

    private void printWelcome()
    {
        System.out.println("Selamat datang di Rizqi Personal Support System.");
        System.out.println();
        System.out.println("Harap beritahu kami masalah anda.");
        System.out.println("Kami akan membantu anda untuk menyelesaikan masalah.");
        System.out.println("Ketik 'bye' untuk exit program.");
    }

    private void printGoodbye()
    {
        System.out.println("Selamat tinggal, Bye...");
    }
}