package tj.dev.test.commons.base.dto;

public abstract class BaseDTO {

	private Long id;

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public BaseDTO(Long id) {
		this.id = id;
	}

	public BaseDTO() {
		super();
	}

}
