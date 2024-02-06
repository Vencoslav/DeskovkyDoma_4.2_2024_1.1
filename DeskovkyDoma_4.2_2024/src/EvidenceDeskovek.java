import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidenceDeskovek {
    public List<Deskovka> seznamDeskovek = new ArrayList<>();
    String nazevSouboru = "DeskovkyDoma_4.2_2024/src/deskovky.txt";

    public List<Deskovka> getSeznamDeskovek() {
        return seznamDeskovek;
    }
    public void nactiEvidenci(){
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader(nazevSouboru)))){
            while(sc.hasNextLine()){
                String radek = sc.nextLine();
                String[] rozdelovac = radek.split(";");
                if(rozdelovac.length !=3){
                    throw  new RuntimeException("Nesprávný počet prvků v evidenci"+radek);
                }
                String nazev = rozdelovac[0].trim();
                Boolean vlastnictvi = Boolean.parseBoolean(rozdelovac[1].trim());
                Integer hodnoceni = Integer.parseInt(rozdelovac[2].trim());
                Deskovka deskovka = new Deskovka(nazev,vlastnictvi,hodnoceni);
                seznamDeskovek.add(deskovka);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Soubor: "+nazevSouboru+" nebyl nalezen "+e.getLocalizedMessage());
        } catch (NumberFormatException ex){
            throw new RuntimeException(ex.getLocalizedMessage());

        }

    }
}
