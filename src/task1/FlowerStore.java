package task1;

public class FlowerStore {
    private Rose rose;
    private Chamomile chamomile;
    private Tulip tulip;
    private Flower flower;
    private int cash;

    public Flower[] sell(int countRose, int countChamomile, int countTulip) {
        Flower [] result = new Flower [countRose + countChamomile + countTulip];
            for(int i = 0; i < countRose; i++) {
                rose = new Rose();
                result[i] = rose;
                cash += rose.getPrice();
            }

            for(int i = 0; i < countChamomile; i++) {
                chamomile = new Chamomile();
                result[countRose + i] = chamomile;
                cash += chamomile.getPrice();
            }

            for(int i = 0; i < countTulip; i++) {
                tulip = new Tulip();
                result[countRose + countChamomile + i] = tulip;
                cash += tulip.getPrice();
            }
            return result;
        }

    public Flower[] sellSequence(int countRose, int countChamomile, int countTulip) {
        int countFlowers = countRose + countChamomile + countTulip;
        Flower[] result = new Flower[countFlowers];
            int j;
            for(int i = 0; i < countFlowers; i += j) {
                j=0;
                if(countRose > 0) {
                    result[i] = new Rose();
                    countRose--;
                    j++;
                    cash += rose.getPrice();
                }
                if (countChamomile > 0) {
                    result[i + j] = new Chamomile();
                    countChamomile--;
                    j++;
                    cash += chamomile.getPrice();
                }
                if(countTulip > 0) {
                    result[i + j] = new Tulip();
                    countTulip--;
                    j++;
                    cash += tulip.getPrice();
                }
            }
            return result;
        }

        public int getCash() {
        return cash;
        }
}
