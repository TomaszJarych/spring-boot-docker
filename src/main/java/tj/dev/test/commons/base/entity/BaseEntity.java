package tj.dev.test.commons.base.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public  final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public BaseEntity(Long id) {
		this.id = id;
	}

	public BaseEntity() {
	}

}
