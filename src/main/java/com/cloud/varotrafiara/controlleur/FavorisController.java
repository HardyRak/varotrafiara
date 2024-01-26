package com.cloud.varotrafiara.controlleur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;
import com.cloud.varotrafiara.model.Favoris;
import com.cloud.varotrafiara.service.FavorisService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/favoris")
@CrossOrigin(origins = "*")
@Service
public class FavorisController {

    @Autowired
    private FavorisService favorisService;

    @PostMapping("/save")
    public Favoris saveFavoris(@RequestBody Favoris favoris) {
        return favorisService.saveFavory(favoris);
    }

    @GetMapping("/all")
    public List<Favoris> findAll() {
        return favorisService.getAllFavoris();
    }

    @GetMapping("utilisatueur/{userId}")
    public List<Favoris> findFavorisByUserId(@PathVariable String userId) {
        return favorisService.findFavorisByUserId(userId);
    }

}
