package com.cloud.varotrafiara.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "imageAnnonce")
public class ImageAnnonce {
    String nom;
    String base64;
}
