package edu.utn;

import edu.utn.classes.Espartano;
import edu.utn.classes.Humano;
import edu.utn.classes.Vikingo;
import edu.utn.dataaccess.DataAccess;
import edu.utn.impl.BeberEspartanoImpl;
import edu.utn.impl.BeberVikingoImpl;
import edu.utn.impl.OrinarEspartanoImpl;
import edu.utn.impl.OrinarVikingoImpl;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Vikingo> vikingos = uploadVikingos();
        List<Espartano> espartanos = uploadEspartanos();

        List<Vikingo> vikingosSorted = vikingos.stream().sorted(Comparator.comparing(Vikingo::getEdad)).collect(Collectors.toList());
        List<Espartano> espartanosSorted = espartanos.stream().sorted(Comparator.comparing(Espartano::getEdad)).collect(Collectors.toList());

        DataAccess db = new DataAccess();

        System.out.println("Vikingos");
        vikingosSorted.forEach(v -> System.out.println(v.getNombre()));
        System.out.println("\nEspartano");
        espartanosSorted.forEach(e -> System.out.println(e.getNombre()));

        Vikingo competidorVikingo = vikingosSorted.get((int)(Math. random()*vikingosSorted.size()));
        Espartano competidorEspartano = espartanosSorted.get((int)(Math. random()*espartanosSorted.size()));

        System.out.println("Del team Vikingo participa "+competidorVikingo.getNombre()+" vs "+competidorEspartano.getNombre()+" del team Espartano");

        Humano ganador = getGanador(competidorVikingo, competidorEspartano);

        System.out.println("El ganador de la competencia es.....");

        System.out.println(ganador.getNombre().toUpperCase()+"!");

        try{
            db.insertWinner(ganador.getNombre(), 10);
        }catch (Exception ex){
            System.out.println(ex.toString()    );
        }

    }

    public static List<Vikingo> uploadVikingos(){
        List<Vikingo> vikingos = new ArrayList<Vikingo>();

        vikingos.add(new Vikingo("Ragnar",33,10, new BeberVikingoImpl(), new OrinarVikingoImpl(),12));
        vikingos.add(new Vikingo("Thor",22,9, new BeberVikingoImpl(), new OrinarVikingoImpl(),91));
        vikingos.add(new Vikingo("Björn",35,8, new BeberVikingoImpl(), new OrinarVikingoImpl(),19));
        vikingos.add(new Vikingo("Loki",56,7, new BeberVikingoImpl(), new OrinarVikingoImpl(),51));
        vikingos.add(new Vikingo("Lagertha",27,16, new BeberVikingoImpl(), new OrinarVikingoImpl(),13));

        return vikingos;
    }

    public static List<Espartano> uploadEspartanos(){
        List<Espartano> espartanos = new ArrayList<Espartano>();

        espartanos.add(new Espartano("Daniel",22,120, new BeberEspartanoImpl(), new OrinarEspartanoImpl(),8));
        espartanos.add(new Espartano("Pepe",21,110, new BeberEspartanoImpl(), new OrinarEspartanoImpl(),70));
        espartanos.add(new Espartano("Juan",20,90, new BeberEspartanoImpl(), new OrinarEspartanoImpl(),17));
        espartanos.add(new Espartano("Martin",19,70, new BeberEspartanoImpl(), new OrinarEspartanoImpl(),14));
        espartanos.add(new Espartano("Leonidas",18,80, new BeberEspartanoImpl(), new OrinarEspartanoImpl(),12));

        return espartanos;
    }

    public static Humano getGanador(Vikingo vikingo, Espartano espartano){

        List<Humano> competidores = new ArrayList<Humano>();
        competidores.add(vikingo);
        competidores.add(espartano);

        Humano ganador = competidores.get((int)(Math.random()*competidores.size()));

        return ganador;
    }


}
