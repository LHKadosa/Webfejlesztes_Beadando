package hu.unideb.hu.webfejlesztes_beadando.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ITEMS")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long ID;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "ABILITY")
    private String ability;

    @ManyToOne
    @JoinColumn(name = "PLAYER")
    private Player player;

    public Item(){

    }

    public Item(Long ID, String name, String type, String ability, Player player){
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.ability = ability;
        this.player = player;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public Player getPlayerDto() {
        return player;
    }

    public void setPlayerDto(Player player) {
        this.player = player;
    }
}
