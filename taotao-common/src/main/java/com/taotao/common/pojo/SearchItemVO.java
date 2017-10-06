package com.taotao.common.pojo;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月6日
 * @description
 */
public class SearchItemVO {

	private String id;
	private String titile;
	private String sellPoint;
	private Long price;
	private String image;
	private String categoryName;
	private String itemDesc;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public String getSellPoint() {
		return sellPoint;
	}

	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "SearchItemVO [id=" + id + ", titile=" + titile + ", sellPoint=" + sellPoint + ", price=" + price
				+ ", image=" + image + ", categoryName=" + categoryName + ", itemDesc=" + itemDesc + "]";
	}

}
