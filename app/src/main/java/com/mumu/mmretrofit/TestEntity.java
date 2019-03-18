package com.mumu.mmretrofit;

import com.google.gson.annotations.SerializedName;
import com.mumu.retrofit.MmResponse;

import java.io.Serializable;

/**
 * @author : zlf
 * date   : 2019/3/11
 * blog   :https://www.jianshu.com/u/281e9668a5a6
 */
public class TestEntity extends MmResponse implements Serializable {

    /**
     * Result : {"Token":"Bearer 6dnWFNx7BLYA71WveHjsU6EU4JHc9DooWYIXKzzzoG0gElGjn6aTveAKmhL2efQIz4yH0KAakKpl9z50pFp4fnm+HNGgopax/k6LkG648/sVPbe9Lqk6nDzuSxzfpCyx5upDdwwMLGtA557Fc/q6PfXAoJjX44bCUKvPVRI/CkUHvNEpyrvyoar2IkfHFUISovpTtK1XKFmeI7OQ0PAd9SZwEg8BWOM7qo0rH0CucXU342+bjj1hjPxxcS8pBhsUF4pSlSoJWMiqSCIwft+KTBDs05G+8vz7l+zY4pGnrI7eCFqLjH4AW+mOJYHHb7cKUFT9SHogTNAoUf+wfIvNHwz74rTx8DvXfNC+AQg9+gI96+fwSB+H4M/3zrUZ9XPe98zTnRu3om/w7dhqIUH+iChR/7B8i80fvNjbodCl11DosV4ySDRO26OKufRoVohHHJ/y1PMmF0xU+eT/cjWs5dl3RRwpmhdaAZ1D79JNCAG6BPRgBYQlSpgNkYtHDvjsubKAD+DfQNO3z8g+N8HR1Ew1kqWUYqcWGEV42yVbRlmFH+NcNX0Pez/Yz2IT4O1Q"}
     */

    @SerializedName("Result")
    private ResultBean ResultX;

    public ResultBean getResultX() {
        return ResultX;
    }

    public void setResultX(ResultBean ResultX) {
        this.ResultX = ResultX;
    }

    public static class ResultBean {
        /**
         * Token : Bearer 6dnWFNx7BLYA71WveHjsU6EU4JHc9DooWYIXKzzzoG0gElGjn6aTveAKmhL2efQIz4yH0KAakKpl9z50pFp4fnm+HNGgopax/k6LkG648/sVPbe9Lqk6nDzuSxzfpCyx5upDdwwMLGtA557Fc/q6PfXAoJjX44bCUKvPVRI/CkUHvNEpyrvyoar2IkfHFUISovpTtK1XKFmeI7OQ0PAd9SZwEg8BWOM7qo0rH0CucXU342+bjj1hjPxxcS8pBhsUF4pSlSoJWMiqSCIwft+KTBDs05G+8vz7l+zY4pGnrI7eCFqLjH4AW+mOJYHHb7cKUFT9SHogTNAoUf+wfIvNHwz74rTx8DvXfNC+AQg9+gI96+fwSB+H4M/3zrUZ9XPe98zTnRu3om/w7dhqIUH+iChR/7B8i80fvNjbodCl11DosV4ySDRO26OKufRoVohHHJ/y1PMmF0xU+eT/cjWs5dl3RRwpmhdaAZ1D79JNCAG6BPRgBYQlSpgNkYtHDvjsubKAD+DfQNO3z8g+N8HR1Ew1kqWUYqcWGEV42yVbRlmFH+NcNX0Pez/Yz2IT4O1Q
         */

        private String Token;

        public String getToken() {
            return Token;
        }

        public void setToken(String Token) {
            this.Token = Token;
        }
    }
}
