import java.util.Random;
import java.util.HashMap;

public class Responder
{
    Random answerNum;
    private String[] answers;
    private HashMap<String, Integer> keywords;
    int allAnswers = 22;
    
    public Responder(){
        answers();
        keywordlist();
    }

    public String generateResponse(String input){
        answerNum = new Random();
        int ai = 0;
        int lastAnswer = 0;
        boolean match = false;
        
        String[] splitInput = input.split("[^a-zA-Z]");         
        
        for(int i = 0; i < splitInput.length && !match; i++){
            if(keywords.containsKey(splitInput[i])){
                match = true;
                ai = keywords.get(splitInput[i]);
            }            
        }
        
        if(!match){        
            while(ai == lastAnswer){
                ai = answerNum.nextInt(10);
            }
        }
                
        lastAnswer = ai;
        return answers[ai];
    }
    
    private void answers(){
                
        answers = new String[allAnswers];
        
            answers[0] = "Apakah kamu sudah bertanya ke Google?";
            answers[1] = "Apakah kamu sudah mencoba mematikan dan menyalakannya kembali?";
            answers[2] = "Lanjutkan bicara, saya akan mengambil kopi dulu.";
            answers[3] = "Ohhh astaga...";
            answers[4] = "42";
            answers[5] = "Saya tidak punya petunjuk.";
            answers[6] = "Ambil jeda, makanlah KitKat.";
            answers[7] = "Ketika semuanya terasa lebih lama...";
            answers[8] = "Memuat 31%";
            answers[9] = "Bicara saja pada tangan.";
            answers[10] = "Java, java, java";
            answers[11] = "Komputer, Komputer, Ordenador";
            answers[12] = "Apple, Apple, Apple, ...";
            answers[13] = "Microsoft, Kecil dan Lembut, pico fofo";
            answers[14] = "Jawaban untuk kehidupan, alam semesta, dan segalanya adalah 42";
            answers[15] = "Mac, mac, mack, muck, mick...";
            answers[16] = "Aaahhh... kita semua akan mati...";
            answers[17] = "Ini mungkin akan memakan waktu.";
            answers[18] = "Mencetak dokumen tidak baik untuk lingkungan.";
            answers[19] = "Distribusi yang mana?";
            answers[20] = "Apakah kamu sudah mencoba me-root-nya?";

               
    }
       
    private void keywordlist(){
        keywords = new HashMap<String, Integer>();
        
        keywords.put("java", 10);
        keywords.put("computer", 11);
        keywords.put("ios", 12);
        keywords.put("windows", 13);
        keywords.put("life", 14);
        keywords.put("mac", 15);
        keywords.put("crashed", 16);
        keywords.put("loading", 17);
        keywords.put("print", 18);
        keywords.put("linux", 19);
        keywords.put("android", 20);
        keywords.put("problem", 2);
    }
}