import yfinance as yf
import yfinance as yf
import pandas as pd
ticker = pd.read_csv(r"C:\Users\FPTSHOP\Downloads\america_2023-06-26.csv")
for name in ticker["Ticker"]:
    data = yf.download("{}".format(name), start="2000-01-01", end="2023-01-01")
    data.to_csv(r"C:\Users\FPTSHOP\Desktop\Stock\{name}.csv".format(name = name))
