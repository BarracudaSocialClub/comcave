/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartworld.transport;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author awiechens
 */
public interface Protokoll {
    
    int senderID = 0; // Von wem wurde die Anweisung gesendet?
    int empfaengerID = 0; // Wer soll die Anweisung erhalten?
    int transportStatus = 0; // Stati: 0>>erstellt und versandt, 1>>empfangen, 2>>ausgeführt
    int transportID = 0; // Nummerierter Knotenpunkt des Transportweges

    /**
     * Zeitpunkt, an dem der Datentransport gestartet wurde , bzw. wann das Protokoll erstellt wurde
     */
    LocalDateTime zeitstempel = LocalDateTime.now();
    
}
