/**
 * @author Latino Francesco
 * @author Serrone Fabio
 * Classe Classe: implementà la classe di una scuola
 */

package scuola;
import java.util.Set;
import java.util.TreeSet;

/*Anno corso*/
public class Classe implements Comparable<Classe>
{
    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param classe
     * @param sezione
     * @param indirizzo
     * @param aula
     * @param sede
     * Imposta cordinatore a null
     *Costruttore partendo da classe, sezione, indirizzo, aula e sede.
     */
    public Classe(int classe, char sezione, String indirizzo, int aula, String sede)
    {
        this.percorso = new PercorsoDidattico(classe, indirizzo);
        this.sezione = sezione;
        this.aula = aula;
        this.sede = sede;
        this.coordinatore = null;
        this.elenco = new TreeSet<>();
        this.numeroStudenti = 0;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param percorsoDidattico
     * @param sezione
     * @param aula
     * @param sede
     * Imposeta cordinatore a null
     *Costruttore partendo da percorso didattico, sezione, aula e sede.
     */
    public Classe(PercorsoDidattico percorsoDidattico, char sezione, int aula, String sede)
    {
        this.percorso = percorsoDidattico;
        this.sezione = sezione;
        this.aula = aula;
        this.sede = sede;
        this.coordinatore = null;
        this.elenco = new TreeSet<>();
        this.numeroStudenti = 0;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param classe
     * @param sezione
     * @param indirizzo
     * Imposta sede e cordinatore a null
     *Costruttore partendo da classe, sezione, ed indirizzo.
     */
    public Classe(int classe, char sezione, String indirizzo)
    {
        this.percorso = new PercorsoDidattico(classe, indirizzo);
        this.sezione = sezione;
        this.aula = 0;
        this.sede = null;
        this.coordinatore = null;
        this.elenco = new TreeSet<>();
        this.numeroStudenti = 0;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return classe
     * Metodo get per l'oggetto percorso, ritorna un l'anno del corso
     */
    public int getClasse()
    {
        return percorso.getannoCorso();
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return indirizzo
     * Metodo get per l'oggetto percorso, ritorna un l'indirizzo frequentato
     */
    public String getIndirizzo()
    {
        return percorso.getIndirizzo();
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return coordinatore
     * Metodo get che ritorna il coordinatore della classe
     */
    public Docente getCoordinatore()
    {
        return this.coordinatore;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param coordinatore
     * Metodo set che imposta il coordinatore della classe
     */
    public void setCoordinatore(Docente coordinatore)
    {
        this.coordinatore = coordinatore;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return sede
     * Metodo get che ritorna la sede della classe
     */
    public String getSede()
    {
        return this.sede;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param sede
     * Metodo set che imposta la sede della classe
     */
    public void setSede(String sede)
    {
        this.sede = sede;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return aula
     * Metodo get che ritorna l'aula della classe
     */
    public int getAula()
    {
        return this.aula;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param aula
     * Metodo set che imposta l'aula della classe
     */
    public void setAula(int aula)
    {
        this.aula = aula;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return percorso
     * Metodo get che ritorna il percorso didattico
     */
    public PercorsoDidattico getPercorso()
    {
        return this.percorso;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param percorso
     * Metodo set che imposta l'percorso didattico
     */
    public void setPercorso(PercorsoDidattico percorso)
    {
        this.percorso = percorso;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return sezione
     * Metodo get che ritorna la sezione della classe
     */
    public char getSezione()
    {
        return this.sezione;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param sezione
     * Metodo set che imposta la sezione della classe
     */
    public void setSezione(char sezione)
    {
        this.sezione = sezione;
    }

     /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return elenco
     * Metodo get che ritorna l'elenco della classe
     */
    public Set<Studente> getElenco()
    {
        return this.elenco;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param elenco
     * Metodo set che imposta l'elenco della classe
     */
    public void setElenco(Set<Studente> elenco)
    {
        this.elenco = elenco;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return numerostudenti
     * Metodo get che ritorna il numero di studenti della classe
     */
    public int getNumeroStudenti()
    {
        return this.numeroStudenti;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param numeroStudenti
     * Metodo set che imposta il numero di studenti della classe
     */
    public void setNumeroStudenti(int numeroStudenti)
    {
        this.numeroStudenti = numeroStudenti;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return classe
     * Metodo get per l'oggetto percorso, ritorna un l'anno e del corso indirizzo frequentato
     */
    public String getClasseSezione(){
        return  percorso.getannoCorso() + "^" + this.sezione;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return studente
     * Metodo get per l'oggetto studente, ritorna uno studente della classe in base alla sua posizione nell'elenco
     */
    public Studente getStudente(int posizione){
        if (posizione < MAX_STUDENTI)
        {
            Studente[] st = elenco.toArray(new Studente[0]);
            return st[posizione];
        }
        else
            throw new IllegalArgumentException();
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return studente se esiste uno studente con quella matricola se non esiste ritorna null
     * Metodo get per l'oggetto studente, ritorna uno studente della classe in base alla sua matricola
     */
    public Studente getStudenteDaMatricola(int matricola)
    {
        for (Studente studente : elenco)
        {
            if(studente.getMatricola() == matricola)
                return studente;
        }
        return null;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @return posizione ritorna -1 se non esite lo studente
     * Metodo get per l'oggetto studente, la posizione di uno studente nell'elenco
     */
    public int getPosizione(Studente st)
    {
        int result = 0;
        for (Studente studente : elenco)
        {
            if (studente.equals(st))
                return result;
            result++;
        }
        return -1;
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @throws IllegalArgumentException se il numero di studenti è maggiore di MAX_STUDENTI
     * @param nuovo
     * Aggiunge uno studente all'elenco
     */
    public void aggiungi(Studente nuovo) throws IllegalArgumentException
    {
        if (this.numeroStudenti + 1 <= MAX_STUDENTI)
        {
            this.elenco.add(nuovo);
            nuovo.classe = this;
            numeroStudenti++;
            Scuola.incrementaStudentiIscritti();
        }
        else
            throw new IllegalArgumentException();
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param nuovo
     * Rimuove uno studente all'elenco
     */
    public void rimuovi(Studente nuovo)
    {
        elenco.remove(nuovo);
        nuovo.classe = null;
        numeroStudenti--;
        Scuola.decrementaStudentiIscritti();
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param classe
     * @param sezione
     * Compara due oggetti classe confrontando la sezione e l'anno del corso
     */
    public boolean equals(int classe, char sezione)
    {
        return classe == percorso.getannoCorso() && Character.toLowerCase(sezione) == Character.toLowerCase(this.sezione);
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * ritorna una stringa con i parametri di un oggetto classe
     */
    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder("Classe " + this.getClasseSezione() + "\n");
        int i = 1;

        for (Studente studente : elenco)
        {
            result.append(i).append(": ").append(studente.toString()).append("\n");
            i++;
        }

        return result.toString();
    }

    /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param altro
     * Compara due oggetti classe confrontando la sezione e l'anno del corso
     */
    @Override
    public boolean equals(Object altro)
    {
        if (altro == this)
            return true;

        if (!(altro instanceof Classe))
            return false;

        Classe classe = (Classe) altro;

        return percorso.getannoCorso() == classe.percorso.getannoCorso() && Character.toLowerCase(this.sezione) == Character.toLowerCase(classe.sezione);
    }

     /**
     * @author Latino Francesco
     * @author Serrone Fabio
     * @param altro
     * implementazione dell'interfaccia compare, ritorna 1 se la media dei voti dell'oggetto chiamnte e maggiore di quella dell'oggetto pasato per parametro, -1 se è minore e 0 se è uguale.
     */
    @Override
    public int compareTo(Classe altro)
    {
        if (altro == this)
            return 0;
        int result = Integer.compare(aula, altro.aula);
        if (result != 0)
            return result;
        return Character.compare(sezione, altro.sezione);
    }

    private PercorsoDidattico percorso;
    private char sezione;
    private int aula;
    private String sede;
    private Docente coordinatore;
    private Set<Studente> elenco;
    private int numeroStudenti;
    public static final int MAX_STUDENTI = 35;
}
