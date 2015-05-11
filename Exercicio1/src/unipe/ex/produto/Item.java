package unipe.ex.produto;

public class Item implements Comparable<Item> {
	private int codigo;
	private String descricao;
	
	public Item(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public boolean equals(Object obj) {
		Item other = (Item) obj;
		if (codigo != other.codigo)
			return false;

		return true;
	}


	@Override
	public int compareTo(Item o) {
		if(codigo < o.getCodigo()){
			return -1;
		}
		if(codigo > o.getCodigo()){
			return 1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "[codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
