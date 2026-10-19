package org.example;

import java.util.*;

public class Student {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String prenume, String grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public void adaugaNota(int nota) {
        this.note.add(nota);
    }

    public boolean esteIntegralist() {
        for (int nota : note) {
            if (nota < 5) {
                return false;
            }
        }
            return true;
        }

        public int nrRestante() {
            int numar = 0;
            for(int nota : note) {
                if (nota < 5){
                    numar++;
                }
            }
            return numar;
        }

        public double medie () {
            if (note.isEmpty()) {
                return 0;
            }
            double suma = 0;
            for (int nota : note) {
                suma += nota;
            }
            return suma / note.size();
        }

        @Override
        public String toString() {
            return grupa + " | " + nume + " " + prenume + " | Note: " + note + " | Medie: " + medie() + " | Restante: " + nrRestante();
        }
    }

