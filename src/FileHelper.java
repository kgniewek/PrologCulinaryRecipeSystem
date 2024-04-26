import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileHelper {
    private static String INPUT_FILE_NAME = "skladniki2.txt";
    private static String OUTPUT_FILE_NAME = "skladnikipl.txt";

    public StringBuilder readingFromFIle() {
        String line;

        StringBuilder sb=new StringBuilder();
        String[] txt = new String[0];
//        List<String> list=new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_NAME))) {
            while ((line = br.readLine()) != null) {

                if(line.contains("\t")){
//                    if(line.contains("~")){
//                        txt=line.split("~");
//                        txt[0]=txt[0].trim().replaceAll("[,()/\".:*+`'-]","").replace(" ","_").replaceAll("[0-9]","").replaceAll("\t",",").replaceFirst(",","").replace("__","").toLowerCase();
//                        txt[1]=txt[1].replace("'","").replace("\"\"","\"");
                    line=line.trim().replaceAll("[,()/\".:*+`'-]","").replace(" ","_").replaceAll("[0-9]","").replaceAll("\t",",").replaceFirst(",","").replace("__","").toLowerCase();
//                    list.add(line);
                }
                sb//.append("przepis('").append(txt[0]).append("','").append(txt[1]).append("').\n");
                        //.append(line.replace("~",":-").replace("-_","-"))//.append(".\n");
                        .append(",");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb;
    }
    public void writeToFIle(){
        try (BufferedWriter bw=new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME))){
            bw.write(readingFromFIle().toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
