package com.exercise.trunarrative.cloud.springrest.entities;

public class Items {

	private Company company;
	private String totalResults;
	private String pageNumber;
	private String kind;
	private String itemsPerPage;
	private String etag;
	Links links;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}

	public String getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getItemsPerPage() {
		return itemsPerPage;
	}

	public void setItemsPerPage(String itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

	public String getEtag() {
		return etag;
	}

	public void setEtag(String etag) {
		this.etag = etag;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}
	
	/**
	 * @param company
	 * @param totalResults
	 */
	public Items(Company company, String totalResults) {
		super();
		this.company = company;
		this.totalResults = totalResults;
	}

	/**
	 * @param companies
	 * @param totalResults
	 * @param pageNumber
	 * @param kind
	 */
	public Items(Company company, String totalResults, String pageNumber, String kind) {
		super();
		this.company = company;
		this.totalResults = totalResults;
		this.pageNumber = pageNumber;
		this.kind = kind;
	}

	/**
	 * @param company
	 * @param totalResults
	 * @param pageNumber
	 * @param kind
	 * @param itemsPerPage
	 * @param etag
	 * @param links
	 */
	public Items(String etag, Links links, Company company, String kind, String itemsPerPage) {
		super();
		this.etag = etag;
		this.links = links;
		this.company = company;
		this.kind = kind;
		this.itemsPerPage = itemsPerPage;
	}

}
