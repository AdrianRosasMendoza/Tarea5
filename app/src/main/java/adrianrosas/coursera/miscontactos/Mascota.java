package adrianrosas.coursera.miscontactos;

/**
 * Created by Sodyck on 16/03/2017.
 */

public class Mascota {

    private String nombre;
    private int foto;
    private int like;

    public Mascota(int foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;
        this.like = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public int getLike() {     return like;    }

    public void setLike(int like) {        this.like = like;    }

    public void setFoto(int foto) {       this.foto = foto;   }
    public void ganarLike(){
        like++;
    }
}
