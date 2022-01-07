package rikkeisoft.com.demo.dto;

import java.util.Objects;

public class ProducDTO {
    private Long id;
    private String name;

    public ProducDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProducDTO producDTO = (ProducDTO) o;
        return Objects.equals(id, producDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "producDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
