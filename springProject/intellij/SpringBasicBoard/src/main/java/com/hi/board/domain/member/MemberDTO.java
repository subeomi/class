package com.hi.board.domain.member;

import lombok.*;


@NoArgsConstructor
@Data
@ToString

public class MemberDTO {

    private int idx;
    private String uid;
    private String uname;
    private String uphoto;

}
