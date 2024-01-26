package com.cloud.varotrafiara.controlleur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;
import com.cloud.varotrafiara.model.Annonce;
import com.cloud.varotrafiara.service.AnnonceService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@RestController
@RequestMapping("/api/annonce")
@CrossOrigin(origins = "*")
@Service
public class AnnonceController {

    @Autowired
    private AnnonceService annonceService;

    @PostMapping("/save")
    public Annonce saveAnnonce(@RequestBody Annonce Annonce) {
        return annonceService.saveAnnonce(Annonce);
    }

    @GetMapping("/all")
    public List<Annonce> findAll() {
        return annonceService.findAll();
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteAnnonce(@PathVariable String id) {
        annonceService.deleteAnnonce(id);
        return new ResponseEntity<>("Annonce supprimée avec succès", HttpStatus.OK);
    }

    @GetMapping("proprietaire/{id}")
    public List<Annonce> findByIdProprietaire(@PathVariable String id){
        return annonceService.findByIdUser(id);
    }
}
