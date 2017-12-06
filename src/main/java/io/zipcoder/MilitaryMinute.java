package io.zipcoder;

public enum MilitaryMinute {


        Zero (0), One (1), Two (2), Three (3), Four (4),
        Five (5), Six (6), Seven (7), Eight (8),Nine (9),
        Ten (10), Eleven (11), Twelve (12), Thirteen (13), Fourteen (14),
        Fifteen (15), Sixteen (16), Seventeen (17), Eighteen (18), Nineteen (19),
        Twenty (20), Twentyone (21), Twentytwo (22), Twentythree (23), Twentyfour(24),
        Twentyfive (25), Twentysix (26), Twentyseven (27), Twentyeight (28), Twentynine (29),
        Thirty (30), Thirtyone (31), Thirtytwo (32), Thirtythree (33), Thirtyfour (34),
        Thirtyfive (35), Thirtysix (36), Thirtyseven (37), Thirtyeight (38), Thirtynine (39),
        Forty (40), Fortyone (41), Fortytwo (42), Fortythree (43), Fortyfour (44),
        Fortyfive (45), Fortysix (46), Fortyseven (47), Fortyeight (48),Fortynine (49),
        Fifty (50), Fiftyone (51), Fiftytwo (52), Fiftythree (53), Fiftyfour (54),
        Fiftyfive (55), Fiftysix (56), Fiftyseven (57), Fiftyeight (58),Fiftynine (59);

        Integer minutesToMatch;

                MilitaryMinute(Integer minutesToMatch){

                this.minutesToMatch = minutesToMatch;
        }


}
