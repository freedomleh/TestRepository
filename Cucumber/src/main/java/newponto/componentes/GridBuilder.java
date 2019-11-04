package newponto.componentes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import webdriver.SeleniumUtil;

public class GridBuilder extends SeleniumUtil {

	    // obrigatorio
		private By tableLocator;

		// opcionais
		private Paginacao paginacao;
		private OrderBy orderBy;
		private Filtro filtro;
		private int indexGrid;
		
		public GridBuilder(By tableLocator, int indexGrid, WebDriver driver) {
			super(driver);
			this.tableLocator = tableLocator; // Nao existia
			this.indexGrid = indexGrid;
		}
		
		public GridBuilder comPaginacao() {

			if (paginacao != null) {
				return this;
			} else {

				this.paginacao = new Paginacao(tableLocator, indexGrid,driver);
				return this;
			}
		}
		
		public GridBuilder comOrderBy() {

			if (orderBy != null) {
				return this;
			} else {
				this.orderBy = new OrderBy(tableLocator, indexGrid,driver); 
				return this;
			}
		}

		public GridBuilder comFiltro() {

			if (filtro != null) {
				return this;
			} else {
				this.filtro = new Filtro(tableLocator, indexGrid,driver); 
				return this;
			}
		}

		public Grid build() {
			return new Grid(tableLocator,indexGrid,filtro,orderBy,paginacao,driver);
		}
		
}
