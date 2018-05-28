/**
 * Eine CD ist ein Medium. Zusätzlich zu den Eigenschaften eines Mediums erfasst
 * sie Informationen zu Spiellänge und Interpret.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2018
 */
class CD implements Medium
{
    /**
     * Der Interpret der CD
     */
    private String _interpret;

    /**
     * Die Spiellänge der CD in Minuten
     */
    private int _spiellaenge;

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    /**
     * Der Titel des Mediums
     * 
     */
    private String _titel;

    /**
     * Initialisiert ein neues Exemplar.
     * 
     * @param titel Der Titel der CD
     * @param kommentar Ein Kommentar zu der CD
     * @param interpret Der Interpret der CD
     * @param spiellaenge Die Spiellaenge der CD in Minuten
     * 
     * @require titel != null
     * @require kommentar != null
     * @require interpret != null
     * @require spiellaenge > 0
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getInterpret() == interpret
     * @ensure getSpiellaenge() == spiellaenge
     */
    public CD(String titel, String kommentar, String interpret, int spiellaenge)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert interpret != null : "Vorbedingung verletzt: interpret != null";
        assert spiellaenge > 0 : "Vorbedingung verletzt: spiellaenge > 0";
        _titel = titel;
        _kommentar = kommentar;
        _spiellaenge = spiellaenge;
        _interpret = interpret;
    }

    /**
     * Gibt den Interpreten der CD zurück.
     * 
     * @return Den Interpreten der CD.
     * 
     * @ensure result != null
     */
    public String getInterpret()
    {
        return _interpret;
    }

    /**
     * Ändert den Interpreten
     * 
     * @param interpret Der Interpret des Mediums
     * 
     * @require interpret != null
     * @ensure getInterpret() == interpret
     */
    public void setInterpret(String interpret)
    {
        assert interpret != null : "Vorbedingung verletzt: interpret != null";
        _interpret = interpret;
    }

    @Override
    public String getMedienBezeichnung()
    {
        return "CD";
    }

    /**
     * Gibt die Spiellänge (in Minuten) der CD zurück.
     * 
     * @return Die Spiellänge der CD.
     * 
     * @ensure result > 0
     */
    public int getSpiellaenge()
    {
        return _spiellaenge;
    }

    /**
     * Ändert die Spiellänge
     * 
     * @param spiellaenge Spiellänge des Medium
     * 
     * @require spiellaenge > 0
     * @ensure getSpielaenge() == spiellaenge
     */
    public void setSpiellaenge(int spiellaenge)
    {
        assert spiellaenge > 0 : "Vorbedingung verletzt: spiellaenge > 0";
        _spiellaenge = spiellaenge;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    @Override
    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }

    @Override
    public String getTitel()
    {
        return _titel;
    }

    @Override
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        _titel = titel;
    }

    @Override
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _titel
                + "\n" + "    " + "Kommentar: " + _kommentar + "\n" + "    "
                + "Interpret: " + _interpret + "\n" + "    " + "Spiellänge: "
                + _spiellaenge + "\n";
    }
}
