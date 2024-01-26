package com.cloud.varotrafiara.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "annonce")
public class Annonce{
    @Id
    String idAnnonce;
    String proprietaireId;
    Long idCategorie;
    Long idMarque;
    String model;
    Long typeMoteurId;
    int consommation;
    int nombrePlace;
    int nombrePorte;
    int annee;
    double kilometrage;
    String provenanceId;
    double prix;
    int statut;
    Date dateAnnonce;
}