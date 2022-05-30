package me.light.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Board {
	private Long bno;
	private String title;
	private String contents;
	private String writer;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;

}
