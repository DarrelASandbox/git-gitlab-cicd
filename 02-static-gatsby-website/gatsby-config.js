require('dotenv').config({ path: `.env.${process.env.NODE_ENV}` });

module.exports = {
  siteMetadata: {
    title: `02-static-gatsby-website`,
    siteUrl: `https://www.yourdomain.tld`,
  },
  plugins: [],
};
