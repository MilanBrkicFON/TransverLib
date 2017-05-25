/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Milan
 */
public interface Akcije {

    int VRATI_SVA_MESTA = 1;
    int VRATI_SVE_CLANOVE = 2;
    int UBACI_CLANA = 3;
    int OBRISI_CLANA = 4;
    int VRATI_SVE_TRENERE = 5;
    int UBACI_TRENERA = 6;
    int OBRISI_TRENERA = 7;
    int VRATI_DATUME = 8;
    int VRATI_VREMENA = 9;
    int DODAJ_CLANA_NA_TRENING = 10;
    int DODAJ_TRENERA_NA_TRENING = 11;
    int KREIRAJ_TRENING = 12;
    int VRATI_MAX_ID = 13;
    int USPOSTAVI_KONEKCIJU_NA_BAZU = 14;
    int PROMENI_CLANOVE = 15;
    int VRATI_SVE_CLANOVE_ZA_TRENING = 16;
    int VRATI_SVE_TRENERE_ZA_TRENING = 17;
    int POSTAVI_OSLUSKIVACA = 18;
}
