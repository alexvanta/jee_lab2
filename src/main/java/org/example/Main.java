package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", "Marian", "225_3"));
        studenti.add(new Student("Popescu", "Maria", "225_3"));
        studenti.add(new Student("Popa", "Marian", "225_3"));
        studenti.add(new Student("Bica", "Irina", "225_3"));
        studenti.add(new Student("Badea", "Ion", "225_1"));
        studenti.add(new Student("Cacoveanu", "Andreea", "225_1"));
        studenti.add(new Student("Onofrei", "Mircea", "225_1"));

        Random rand = new Random();
        for (Student s : studenti) {
            for (int i = 0; i < 5; i++) {
                s.adaugaNota(rand.nextInt(7) + 4);
            }
        }
        Collections.sort(studenti, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int cmpGrupa = s1.getGrupa().compareTo(s2.getGrupa());
                if (cmpGrupa != 0) {
                    return cmpGrupa;
                }

                int cmpNume = s1.getNume().compareTo(s2.getNume());
                if (cmpNume != 0) {
                    return cmpNume;
                }

                return s1.getPrenume().compareTo(s2.getPrenume());
            }
        });

        System.out.println(" b1) Studenti ordonati pe grupe si alfabetic");
        for (Student s : studenti) {
            System.out.println(s);
        }

        List<Student> integralisti = new ArrayList<>();
        List<Student> restantieri = new ArrayList<>();
        for (Student s : studenti) {
            if (s.esteIntegralist()) {
                integralisti.add(s);
            } else {
                restantieri.add(s);
            }
        }

        Collections.sort(integralisti, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.medie(), s1.medie());
            }
        });

        System.out.println("b2) Integralisti");
        for (Student s : integralisti) {
            System.out.println(s);
        }

        Collections.sort(restantieri, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.nrRestante(), s2.nrRestante());
            }
        });
        System.out.println("b3) Restantieri");
        for (Student s : restantieri) {
            System.out.println(s);
        }
    }
}
