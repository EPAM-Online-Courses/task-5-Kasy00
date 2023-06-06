package efs.task.collections.data;

import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataProvider {

    public static final String DATA_SEPARATOR = ",";

    // TODO Utwórz listę miast na podstawie tablicy Data.baseTownsArray.
    //  Tablica zawiera String zawierający nazwę miasta oraz dwie klasy bohatera związane z tym miastem oddzielone przecinkami.
    //  Korzystając z funkcji split() oraz stałej DATA_SEPARATOR utwórz listę obiektów klasy efs.task.collections.entities.Town.
    //  Funkcja zwraca listę obiektów typu Town ze wszystkimi dziewięcioma podstawowymi miastami.
    public List<Town> getTownsList() {
        List<Town> townsList = new ArrayList<>();
        for(String townsData : Data.baseTownsArray){
            String[] townInfo = townsData.split(DATA_SEPARATOR);
            String townName = townInfo[0].trim();
            String heroClass1 = townInfo[1].trim();
            String heroClass2 = townInfo[2].trim();

            List<String> startingHeroClasses = new ArrayList<>();
            startingHeroClasses.add(heroClass1);
            startingHeroClasses.add(heroClass2);

            Town town = new Town(townName, startingHeroClasses);
            townsList.add(town);
        }
        return townsList;
    }

    //TODO Analogicznie do getTownsList utwórz listę miast na podstawie tablicy Data.DLCTownsArray
    public List<Town> getDLCTownsList() {
        List<Town> DLCTownsList = new ArrayList<>();
        for(String DLCtownData : Data.dlcTownsArray){
            String[] DLCtownInfo = DLCtownData.split(DATA_SEPARATOR);
            String townName = DLCtownInfo[0].trim();
            String heroClass1 = DLCtownInfo[1].trim();
            String heroClass2 = DLCtownInfo[2].trim();
            
            List<String> startingHeroClasses = new ArrayList<>();
            startingHeroClasses.add(heroClass1);
            startingHeroClasses.add(heroClass2);

            Town town = new Town(townName, startingHeroClasses);
            DLCTownsList.add(town);
        }
        return DLCTownsList;
    }

    //TODO Na podstawie tablicy Data.baseCharactersArray utworzyć listę bohaterów dostępnych w grze.
    // Tablica Data.baseCharactersArray zawiera oddzielone przecinkiem imie bohatera, klasę bohatera.
    // Korzystając z funkcji split() oraz DATA_SEPARATOR utwórz listę unikalnych obiektów efs.task.collections.entities.Hero.
    // UWAGA w Data.baseCharactersArray niektórzy bohaterowie powtarzają się, do porównania bohaterów używamy zarówno imie jak i jego klasę;
    public Set<Hero> getHeroesSet() {
        Set<Hero> heroesSet = new HashSet<>();
        for(String heroesData : Data.baseCharactersArray){
            String[] heroesInfo = heroesData.split(DATA_SEPARATOR);
            String heroName = heroesInfo[0].trim();
            String heroClass = heroesInfo[1].trim();

            Hero hero = new Hero(heroName, heroClass);
            heroesSet.add(hero);
        }
        return heroesSet;
    }

    //TODO Analogicznie do getHeroesSet utwórz listę bohaterów na podstawie tablicy Data.DLCCharactersArray
    public Set<Hero> getDLCHeroesSet() {
        Set<Hero> dlcHeroesSet = new HashSet<>();
        for(String dlcHeroesData : Data.dlcCharactersArray){
            String[] dlcHeroesInfo = dlcHeroesData.split(DATA_SEPARATOR);
            String heroName = dlcHeroesInfo[0].trim();
            String heroClass = dlcHeroesInfo[1].trim();

            Hero hero = new Hero(heroName, heroClass);
            dlcHeroesSet.add(hero);
        }
        return dlcHeroesSet;
    }
}
