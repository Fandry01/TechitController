package Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TelevisionController {
    @GetMapping(value = "/television")
    public ResponseEntity<Object> getAllTV(){
        return ResponseEntity.ok("Tv");
    }

    @GetMapping("/television/{id}")
    public ResponseEntity<Object> getTv(@PathVariable int id){
        return ResponseEntity.ok("Tv");
    }

    @PostMapping("/television")
        public ResponseEntity<Object> addTv(@RequestBody String television)
        {

            return ResponseEntity.created(null).body("television");
        }
    @DeleteMapping("/television/{id}")
    public ResponseEntity<Object> DeleteTV(@PathVariable int id){
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/television")
    public ResponseEntity<Object> UpdateTv(@PathVariable int id,@RequestBody String television){
        return ResponseEntity.noContent().build();
    }
}
