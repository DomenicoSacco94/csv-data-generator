const path = require('path');

module.exports = {
  chainWebpack: config => {
    config.resolve.alias.set('@', path.resolve(__dirname, 'src'));
    config.module
      .rule('ts')
      .test(/\.ts$/)
      .use('ts-loader')
      .loader('ts-loader')
      .tap(options => {
        return {
          ...options,
          transpileOnly: true
        };
      });
  }
};