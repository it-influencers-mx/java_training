package com.accenture.chapter1.repaso;

import java.util.Date; //Al realizar el import expl�cito de la clase, �ste toma precedencia sobre el wildcard.
import java.sql.*; 

public class ImportsConflictoNombre {
	Date d1; //Tipo java.util.Date
	java.sql.Date d2; //Tipo java.sql.Date
	
}
