package tech.rango.CFVView.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String imageUrl;
	private int grade;
	private String icon;
	private int power;
	private int crit;
	private int shield;
	private String nation;
	private String clan;
	private String race;
	private String design; 
	private String illust;
	private int booster_id;
	private String rarity;
	private String flavor_text;
	private String card_effect;
	private String bushiCode;
	@Column(nullable = false, updatable = false)
	private String cardCode;
	
	public Card() {}
	
	public Card(String name, String imageUrl, int grade, String icon, int power, int crit, int shield, String nation,
			String clan, String race, String design, String illust, int booster_id, String rarity, String flavor_text,
			String card_effect, String bushiCode, String cardCode) {
		super();
		this.name = name;
		this.imageUrl = imageUrl;
		this.grade = grade;
		this.icon = icon;
		this.power = power;
		this.crit = crit;
		this.shield = shield;
		this.nation = nation;
		this.clan = clan;
		this.race = race;
		this.design = design;
		this.illust = illust;
		this.booster_id = booster_id;
		this.rarity = rarity;
		this.flavor_text = flavor_text;
		this.card_effect = card_effect;
		this.bushiCode = bushiCode;
		this.cardCode = cardCode;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getCrit() {
		return crit;
	}
	public void setCrit(int crit) {
		this.crit = crit;
	}
	public int getShield() {
		return shield;
	}
	public void setShield(int shield) {
		this.shield = shield;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getClan() {
		return clan;
	}
	public void setClan(String clan) {
		this.clan = clan;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public String getIllust() {
		return illust;
	}
	public void setIllust(String illust) {
		this.illust = illust;
	}
	public int getBooster_id() {
		return booster_id;
	}
	public void setBooster_id(int booster_id) {
		this.booster_id = booster_id;
	}
	public String getRarity() {
		return rarity;
	}
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}
	public String getFlavor_text() {
		return flavor_text;
	}
	public void setFlavor_text(String flavor_text) {
		this.flavor_text = flavor_text;
	}
	public String getCard_effect() {
		return card_effect;
	}
	public void setCard_effect(String card_effect) {
		this.card_effect = card_effect;
	}
	public String getBushiCode() {
		return bushiCode;
	}
	public void setBushiCode(String bushiCode) {
		this.bushiCode = bushiCode;
	}
	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	
	@Override
	public String toString() {
		return "Card [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", grade=" + grade + ", icon=" + icon
				+ ", power=" + power + ", crit=" + crit + ", shield=" + shield + ", nation=" + nation + ", clan=" + clan
				+ ", race=" + race + ", design=" + design + ", illust=" + illust + ", booster_id=" + booster_id
				+ ", rarity=" + rarity + ", flavor_text=" + flavor_text + ", card_effect=" + card_effect
				+ ", bushiCode=" + bushiCode + ", cardCode=" + cardCode + "]";
	}
	
	
}
