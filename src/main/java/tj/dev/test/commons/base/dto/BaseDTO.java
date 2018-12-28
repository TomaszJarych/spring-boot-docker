package tj.dev.test.commons.base.dto;

public abstract class BaseDTO {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BaseDTO(Long id) {
		this.id = id;
	}

	public BaseDTO() {
		super();
	}

}
