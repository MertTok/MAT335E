package Homework1;

public class Clip {
    private int bulletCapacity;
    private int bulletsLeft;

    Clip(int bulletCapacity, int bulletsLeft){
        this.bulletCapacity = bulletCapacity;
        this.bulletsLeft = bulletsLeft;
    }

    // Getters and Setters
    public int getBulletCapacity() {
        return bulletCapacity;
    }

    public void setBulletCapacity(int bulletCapacity){
        this.bulletCapacity = bulletCapacity;
    }

    public int getBulletsLeft() {
        return bulletsLeft;
    }

    public void setBulletsLeft(int bulletsLeft) {
        this.bulletsLeft = bulletsLeft;
    }

    // Helper Methods
    public void fire(){
        if(bulletsLeft <= 0){
            System.out.print("Good heavens we are out of ammo!");
            return;
        }
        bulletsLeft--;
    }

    public void reload(){
        bulletsLeft = bulletCapacity;
        System.out.println("RELOADING!");
    }
}
