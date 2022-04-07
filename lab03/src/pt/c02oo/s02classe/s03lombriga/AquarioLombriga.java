package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
    int head, l_size, a_size, dir;
    AquarioLombriga(int a_size, int l_size, int ini) {
        head = ini;
        this.l_size = l_size;
        this.a_size = a_size;
        dir = 0;
    }
    void crescer() {
        if(dir == 0) {
            if(head + l_size <= a_size) {
                l_size++;
            }
        }
        else {
            if(head - l_size >= 1) {
                l_size++;
            }
        }
    }
    void mover() {
        if(dir == 0) {
            if(head == 1) {
                head = l_size;
                dir = 1;
            }
            else {
                head--;
            }
        }
        else {
            if(head == a_size) {
                head = a_size - l_size + 1;
                dir = 0;
            }
            else {
                head++;
            }
        }
    }
    void virar() {
        if(dir == 0) {
            head = l_size + head - 1;
            dir = 1;
        }
        else {
            head = head - l_size + 1;
            dir = 0;
        }
    }
    String apresenta() {
        String aq = new String();
        int ini, fim;
        if(dir == 0) {
            ini = head;
            fim = head + l_size - 1;
        }
        else {
            ini = head - l_size + 1;
            fim = head;
        }
        for(int i = 1; i <= a_size; i++) {
            if(i == head) aq += "0";
            else if(i < ini || i > fim) aq += "#";
            else aq += "@";
        }
        return aq;
    }
}