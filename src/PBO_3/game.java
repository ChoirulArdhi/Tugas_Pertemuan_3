package PBO_3;

public class game {
    public static void main(String[] args) 
    {
        player petani = new player();
        
        petani.name = "Choirul";
        petani.speed = 78;
        petani.healthPoin = 0;
        
        petani.run();
        
        if(petani.isDead())
        {
            System.out.println("Game Over!");
        }
    }
}
